package omar.dguez.dacodesmovies.Fragments.RecyclerFragment

import omar.dguez.dacodesmovies.Models.Movie

/**
 * RecyclerFragmentView
 */
interface RecyclerFragmentView {
    fun failure(msg: String)
    fun fillData(current: Int, last: Int, movieList: List<Movie>, fromSwipe: Boolean)
}