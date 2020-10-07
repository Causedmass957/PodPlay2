package com.raywenderlich.podplay.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 <2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001<B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0015H\u0002J\u0012\u0010\u001e\u001a\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cH\u0014J\u0010\u0010&\u001a\u00020\u00152\u0006\u0010\'\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020\u00152\u0006\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020\u0015H\u0016J\b\u0010-\u001a\u00020\u0015H\u0016J\u0010\u0010.\u001a\u00020\u00152\u0006\u0010/\u001a\u000200H\u0002J\b\u00101\u001a\u00020\u0015H\u0002J\b\u00102\u001a\u00020\u0015H\u0002J\b\u00103\u001a\u00020\u0015H\u0002J\b\u00104\u001a\u00020\u0015H\u0002J\b\u00105\u001a\u00020\u0015H\u0002J\u0010\u00106\u001a\u00020\u00152\u0006\u00107\u001a\u000200H\u0002J\b\u00108\u001a\u00020\u0015H\u0002J\b\u00109\u001a\u00020\u0015H\u0002J\b\u0010:\u001a\u00020\u0015H\u0002J\b\u0010;\u001a\u00020\u0015H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006="}, d2 = {"Lcom/raywenderlich/podplay/ui/PodcastActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/raywenderlich/podplay/adapter/PodcastListAdapter$PodcastListAdapterListener;", "Lcom/raywenderlich/podplay/ui/PodcastDetailsFragment$OnPodcastDetailsListener;", "()V", "podcastListAdapter", "Lcom/raywenderlich/podplay/adapter/PodcastListAdapter;", "podcastViewModel", "Lcom/raywenderlich/podplay/viewmodel/PodcastViewModel;", "getPodcastViewModel", "()Lcom/raywenderlich/podplay/viewmodel/PodcastViewModel;", "podcastViewModel$delegate", "Lkotlin/Lazy;", "searchMenuItem", "Landroid/view/MenuItem;", "searchViewModel", "Lcom/raywenderlich/podplay/viewmodel/SearchViewModel;", "getSearchViewModel", "()Lcom/raywenderlich/podplay/viewmodel/SearchViewModel;", "searchViewModel$delegate", "addBackStackListener", "", "createEpisodePlayerFragment", "Lcom/raywenderlich/podplay/ui/EpisodePlayerFragment;", "createPodcastDetailsFragment", "Lcom/raywenderlich/podplay/ui/PodcastDetailsFragment;", "handleIntent", "intent", "Landroid/content/Intent;", "hideProgressBar", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onNewIntent", "onShowDetails", "podcastSummaryViewData", "Lcom/raywenderlich/podplay/viewmodel/SearchViewModel$PodcastSummaryViewData;", "onShowEpisodePlayer", "episodeViewData", "Lcom/raywenderlich/podplay/viewmodel/PodcastViewModel$EpisodeViewData;", "onSubscribe", "onUnsubscribe", "performSearch", "term", "", "scheduleJobs", "setupPodcastListView", "setupToolbar", "setupViewModels", "showDetailsFragment", "showError", "message", "showPlayerFragment", "showProgressBar", "showSubscribedPodcasts", "updateControls", "Companion", "app_debug"})
public final class PodcastActivity extends androidx.appcompat.app.AppCompatActivity implements com.raywenderlich.podplay.adapter.PodcastListAdapter.PodcastListAdapterListener, com.raywenderlich.podplay.ui.PodcastDetailsFragment.OnPodcastDetailsListener {
    private final kotlin.Lazy searchViewModel$delegate = null;
    private final kotlin.Lazy podcastViewModel$delegate = null;
    private com.raywenderlich.podplay.adapter.PodcastListAdapter podcastListAdapter;
    private android.view.MenuItem searchMenuItem;
    private static final java.lang.String TAG_DETAILS_FRAGMENT = "DetailsFragment";
    private static final java.lang.String TAG_EPISODE_UPDATE_JOB = "com.raywenderlich.podplay.episodes";
    private static final java.lang.String TAG_PLAYER_FRAGMENT = "PlayerFragment";
    public static final com.raywenderlich.podplay.ui.PodcastActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.raywenderlich.podplay.viewmodel.SearchViewModel getSearchViewModel() {
        return null;
    }
    
    private final com.raywenderlich.podplay.viewmodel.PodcastViewModel getPodcastViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onSubscribe() {
    }
    
    @java.lang.Override()
    public void onUnsubscribe() {
    }
    
    @java.lang.Override()
    public void onShowEpisodePlayer(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.podplay.viewmodel.PodcastViewModel.EpisodeViewData episodeViewData) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    protected void onNewIntent(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    @java.lang.Override()
    public void onShowDetails(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.podplay.viewmodel.SearchViewModel.PodcastSummaryViewData podcastSummaryViewData) {
    }
    
    private final void scheduleJobs() {
    }
    
    private final void showSubscribedPodcasts() {
    }
    
    private final void performSearch(java.lang.String term) {
    }
    
    private final void handleIntent(android.content.Intent intent) {
    }
    
    private final void setupToolbar() {
    }
    
    private final void setupViewModels() {
    }
    
    private final void setupPodcastListView() {
    }
    
    private final void addBackStackListener() {
    }
    
    private final void updateControls() {
    }
    
    private final void showDetailsFragment() {
    }
    
    private final void showPlayerFragment() {
    }
    
    private final com.raywenderlich.podplay.ui.EpisodePlayerFragment createEpisodePlayerFragment() {
        return null;
    }
    
    private final com.raywenderlich.podplay.ui.PodcastDetailsFragment createPodcastDetailsFragment() {
        return null;
    }
    
    private final void showProgressBar() {
    }
    
    private final void hideProgressBar() {
    }
    
    private final void showError(java.lang.String message) {
    }
    
    public PodcastActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/raywenderlich/podplay/ui/PodcastActivity$Companion;", "", "()V", "TAG_DETAILS_FRAGMENT", "", "TAG_EPISODE_UPDATE_JOB", "TAG_PLAYER_FRAGMENT", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}