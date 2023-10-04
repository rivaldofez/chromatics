package com.rivaldofez.chromatics.ui.navigation

sealed class Screen(val route: String) {
    object Game: Screen("game")
    object Leaderboard: Screen("leaderboard")
}