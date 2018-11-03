

package com.frovis.vuitro.ui.feed.blogs;

import android.arch.lifecycle.MutableLiveData;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableList;

import com.frovis.vuitro.data.DataManager;
import com.frovis.vuitro.data.model.api.BlogResponse;
import com.frovis.vuitro.ui.base.BaseViewModel;
import com.frovis.vuitro.utils.rx.SchedulerProvider;

import java.util.List;

/**
 * Created by amitshekhar on 10/07/17.
 */

public class BlogViewModel extends BaseViewModel<BlogNavigator> {

    public final ObservableList<BlogResponse.Blog> blogObservableArrayList = new ObservableArrayList<>();

    private final MutableLiveData<List<BlogResponse.Blog>> blogListLiveData;

    public BlogViewModel(DataManager dataManager,
                         SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
        blogListLiveData = new MutableLiveData<>();
        fetchBlogs();
    }

    public void addBlogItemsToList(List<BlogResponse.Blog> blogs) {
        blogObservableArrayList.clear();
        blogObservableArrayList.addAll(blogs);
    }

    public void fetchBlogs() {
        setIsLoading(true);
        getCompositeDisposable().add(getDataManager()
                .getBlogApiCall()
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe(blogResponse -> {
                    if (blogResponse != null && blogResponse.getData() != null) {
                        blogListLiveData.setValue(blogResponse.getData());
                    }
                    setIsLoading(false);
                }, throwable -> {
                    setIsLoading(false);
                    getNavigator().handleError(throwable);
                }));
    }

    public MutableLiveData<List<BlogResponse.Blog>> getBlogListLiveData() {
        return blogListLiveData;
    }

    public ObservableList<BlogResponse.Blog> getBlogObservableList() {
        return blogObservableArrayList;
    }
}
