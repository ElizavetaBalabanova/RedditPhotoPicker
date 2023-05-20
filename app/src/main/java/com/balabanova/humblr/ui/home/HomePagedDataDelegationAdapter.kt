package com.balabanova.humblr.ui.home

import com.balabanova.humblr.domain.ListItem
import com.balabanova.humblr.domain.tools.ClickableView
import com.balabanova.humblr.domain.tools.SubQuery
import com.balabanova.humblr.ui.ListItemDiffUtil
import com.balabanova.humblr.ui.delegates.postsDelegate
import com.balabanova.humblr.ui.delegates.subredditsDelegate
import com.balabanova.humblr.tools.PagedDataDelegationAdapter

class HomePagedDataDelegationAdapter(
    private val onClick: (subQuery: SubQuery, item: ListItem, clickableView: ClickableView) -> Unit,
) : PagedDataDelegationAdapter<ListItem>(ListItemDiffUtil()) {
    init {
        delegatesManager.addDelegate(subredditsDelegate {
                subQuery: SubQuery, listItem: ListItem, clickableView: ClickableView ->
            onClick(subQuery, listItem, clickableView)
            }
        )
            .addDelegate(postsDelegate {
                subQuery: SubQuery, listItem: ListItem, clickableView: ClickableView ->
            onClick(subQuery, listItem, clickableView)
        }
        )
    }
}
