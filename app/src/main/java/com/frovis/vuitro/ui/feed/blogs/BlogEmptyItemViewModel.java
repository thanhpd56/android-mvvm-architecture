

package com.frovis.vuitro.ui.feed.blogs;

/**
 * Created by amitshekhar on 10/07/17.
 */

public class BlogEmptyItemViewModel {

    private BlogEmptyItemViewModelListener mListener;

    public BlogEmptyItemViewModel(BlogEmptyItemViewModelListener listener) {
        this.mListener = listener;
    }

    public void onRetryClick() {
        mListener.onRetryClick();
    }

    public interface BlogEmptyItemViewModelListener {

        void onRetryClick();
    }
}
