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
package com.example.dogglers.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.R
import com.example.dogglers.const.Layout
import com.example.dogglers.data.DataSource
import com.example.dogglers.model.Dog


/**
 * Adapter to inflate the appropriate list item layout and populate the view with information
 * from the appropriate data source
 */
class DogCardAdapter(
    private val context: Context?,
    private val layout: Int
): RecyclerView.Adapter<DogCardAdapter.DogCardViewHolder>() {

    // The global variable of dogs (now longhorns) are initialized.
    private val dogsList: List<Dog> = DataSource.dogs

    /**
     * Initialize view elements (the image, name, hobbies, and age of the
     * animal)
     */
    class DogCardViewHolder(view: View?): RecyclerView.ViewHolder(view!!) {
        val animalImage: ImageView? = view?.findViewById(R.id.animal_pic)
        val animalName: TextView? = view?.findViewById(R.id.animal_name)
        val animalHobbies: TextView? = view?.findViewById(R.id.animal_hobbies)
        val animalAge: TextView? = view?.findViewById(R.id.animal_age)
    }

    /**
     * The onCreateViewHolder will initialize the DogCardViewHolder based on the layout
     * view selected by the user (whatever button the user clicks will be the view).
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogCardViewHolder {
        // The layout type is set to either grid or vertical/horizontal view layouts.
        var layoutToUse = when(layout) {
            Layout.GRID -> R.layout.grid_list_item
            else -> R.layout.vertical_horizontal_list_item
        }

        // The layout is inflated with the selected layout.
        val adaptedLayout = LayoutInflater.from(parent.context).inflate(layoutToUse, parent, false)

        // The ViewHolder is created and returned.
        return DogCardViewHolder(adaptedLayout)
    }

    // This function will return the size of the dataset.
    override fun getItemCount() = dogsList.size

    /**
     * The elements being displayed in the View are changed depending on the
     * current position in the global dogs array.
     */
    override fun onBindViewHolder(holder: DogCardViewHolder, position: Int) {
        // This is the dog (longhorn) at the current position.
        val item = dogsList[position]
        // The image resource is set to the image of the current animal.
        holder.animalImage?.setImageResource(item.imageResourceId)
        // The name of the animal on the view is set to the current name of the animal.
        holder.animalName?.text = item.name
        // The resources of the project are obtained.
        val resources = context?.resources
        // The age of the animal on the view is set to that of the current animal.
        holder.animalAge?.text = resources?.getString(R.string.dog_age, item.age)
        // tHe hobbies of the animal on the view are set to that of the current animal.
        holder.animalHobbies?.text = resources?.getString(R.string.dog_hobbies, item.hobbies)
    }
}
