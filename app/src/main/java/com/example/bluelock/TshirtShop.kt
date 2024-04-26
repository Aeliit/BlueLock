package com.example.bluelock

data class TshirtShop(
    var charName: String,
    var name : String,
    var imageRes : Int,
)

data class Characters(
    var charactername : String,
    var  description: String,
    var img : Int,
)
    fun getallTshirtShop(): List<TshirtShop>{
        return listOf<TshirtShop>(
           TshirtShop("Blue Lock Tshirt", "289.00",R.drawable.tshirt3),
            TshirtShop("Blue Lock Tshirt 2", "289.00",R.drawable.tshirt2),
            TshirtShop("Blue Lock Tshirt 3", "289.00",R.drawable.tshirt4),
            TshirtShop("Blue Lock Shoes", "3560.00",R.drawable.shoes),
            TshirtShop("Blue Lock Shoes 2", "3560.00",R.drawable.shoes2),
            TshirtShop("Blue Lock Shoes 3", "3560.00",R.drawable.shoes3),
            TshirtShop("Blue Lock Shoes 4", "3560.00",R.drawable.shoes4),
            TshirtShop("Blue Lock Shoes 5", "3560.00",R.drawable.shoes5),
            TshirtShop("Blue Lock Logo", "25.00",R.drawable.bluelock),
        )

}

    fun getallCharacterShop(): List<Characters>{
        return listOf<Characters>(
            Characters("Bachira Meguru", "Position: Forward", R.drawable.bachira1),
            Characters("Baro Shoei", "Position: Forward", R.drawable.baro2),
            Characters("Isagi Yoichi", "Position: Forward", R.drawable.isagi1),
            Characters("Rensuke Kunigami", "Position: Forward", R.drawable.kunigami),
            Characters("Hyoma Chigiri", "Position: Forward", R.drawable.hyoma),
            Characters("Reo Mikage", "Position: Forward", R.drawable.reo),
            Characters("Seishiro Nagi", "Position: Forward", R.drawable.nagi2),
            Characters("Itoshi Rin", "Position: Forward", R.drawable.rin1),

        )
    }
