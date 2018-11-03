

package com.frovis.vuitro.ui.feed.blogs;

import com.frovis.vuitro.data.model.api.BlogResponse;

import java.util.List;

/**
 * Created by amitshekhar on 10/07/17.
 */

public interface BlogNavigator {

    void handleError(Throwable throwable);

    void updateBlog(List<BlogResponse.Blog> blogList);
}
