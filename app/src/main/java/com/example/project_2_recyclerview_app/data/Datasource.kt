package com.example.project_2_recyclerview_app.data

import com.example.project_2_recyclerview_app.R
import com.example.project_2_recyclerview_app.model.Sneakers

class Datasource{

    fun loadMune() : List<Sneakers>{
        return listOf(
            Sneakers(R.string.adidas1, R.drawable.a1),
            Sneakers(R.string.adidas2, R.drawable.a2),
            Sneakers(R.string.adidas3, R.drawable.a3),
            Sneakers(R.string.adidas4, R.drawable.a4),
            Sneakers(R.string.adidas5, R.drawable.a5),
            Sneakers(R.string.adidas6, R.drawable.a6),
        )
    }

}