package com.dicoding.foodapps

object FoodsData {

    private val foodNames = arrayOf("Ati Ampela",
            "Balado Cumi",
            "Balado Jengkol",
            "Dendeng Lado",
            "Ikan Bakar Madu",
            "Rendang",
            "Tauco Sayur",
            "Tenggiri Asam",
            "Tongkol Jontor",
            "Udang Pedas Manis")

    private val foodsDetail = arrayOf("Harga : Rp 16.000 \n\nMasakan dengan bahan dasar Ati Ampela  ",
            "Harga : Rp 17.000 \n\n",
            "Harga : Rp 18.000 \n\n",
            "Harga : Rp 15.000 \n\n",
            "Harga : Rp 17.000 \n\n",
            "Harga : Rp 19.000 \n\n",
            "Harga : Rp 20.000 \n\n",
            "Harga : Rp 17.500 \n\n",
            "Harga : Rp 14.000 \n\n",
            "Harga : Rp 16.000 \n\n")

    private val foodsImages = intArrayOf(R.drawable.ati_ampela,
            R.drawable.balado_cumi,
            R.drawable.balado_jengkol,
            R.drawable.dendeng_lado,
            R.drawable.ikan_bakar_madu,
            R.drawable.rendang,
            R.drawable.tauco_sayur,
            R.drawable.tengiri_asam,
            R.drawable.tongkol_jontor,
            R.drawable.udang_pedas_manis)



    val listData: ArrayList<Food>
        get() {
            val list = arrayListOf<Food>()
            for (position in foodNames.indices) {
                val food = Food()
                food.name = foodNames[position]
                food.detail = foodsDetail[position]
                food.photo = foodsImages[position]
                list.add(food)
            }
            return list
        }
}