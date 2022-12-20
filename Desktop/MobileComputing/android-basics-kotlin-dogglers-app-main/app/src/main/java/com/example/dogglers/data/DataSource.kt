/*
* Copyright (C) 2021 The Android Open Source Project.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.example.dogglers.data

import com.example.dogglers.R
import com.example.dogglers.model.Dog

/**
 * An object to generate a static list of dogs
 */
object DataSource {
    // The dog variables have been overwritten with Longhorns.
    // Each longhorn has its own name, age, hobby, and image
    // associated with it.
    val dogs: List<Dog> = listOf(
        Dog(
            R.drawable.longhorn1,
            "James",
            "7",
            "chess club"
        ),
        Dog(
            R.drawable.longhorn_2,
            "Bernard",
            "4",
            "modeling"
        ),
        Dog(
            R.drawable.orange_horn,
            "Bevo",
            "11",
            "watching football"
        ),
        Dog(
            R.drawable.baby_longhorn,
            "Otis",
            "1",
            "exploring"
        ),
        Dog(
            R.drawable.white_longhorn,
            "Alfredo",
            "7",
            "hide-n-seek"
        ),
        Dog(
            R.drawable.mascot_horn,
            "Hook Em",
            "5",
            "Cheer Team"
        )
    )
}
