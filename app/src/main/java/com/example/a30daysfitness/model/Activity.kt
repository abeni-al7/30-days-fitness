package com.example.a30daysfitness.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Activity(
    @StringRes val day: Int,
    @StringRes val exercise: Int,
    @StringRes val description: Int,
    @DrawableRes val image: Int
)
