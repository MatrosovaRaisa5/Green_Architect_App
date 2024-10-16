package com.yt.greenarchitectapp.model

import android.os.Parcelable
import com.yt.greenarchitectapp.R
import kotlinx.parcelize.Parcelize

@Parcelize
data class Vegetables(
    val name:String,
    val info:String,
    val returnPlaces:String,
    val image:Int,
    val listOFImages:List<Int>
):Parcelable

val listOfVegetables = listOf(
    Vegetables(
        "Кукуруза ранняя\nЛАКОМКА",
        "Раннеспелый, высокоурожайный сорт сахарной кукурузы. Початок слабо конической формы, средней массой 200 г, длиной 18-20 см. Зерно желто-оранжевое, кожица зерна нежная, мякоть сладкая. Рекомендуется в свежем, консервированном виде, для замораживания. Вкусовые качества вареной и консервированной продукции хорошие. Урожайность чистых кондиционных початков 40-54 ц/га.",
        "Агро онлайн\nБелая орхидея\nОмск Усадьба",
        R.drawable.p11,
        listOf(
            R.drawable.p11,
            R.drawable.p12,
            R.drawable.p12
        )
    ),

    Vegetables(
        "Редис\nГЛОРИЕТ F1",
        "Гибрид редиса среднераннего срока созревания. Срок созревания 20 дней. Корнеплоды хорошо выравнены по размеру и форме, красного цвета – имеют отличный товарный вид. Долго не образует пустот. Форма округлая, диаметр 2,5-5,0 см Поверхность очень гладкая Внутренняя окраска - белая Высота ботвы 10-12 см, полу-прямостоячая\nДополнительная информация: Рекомендуется для выращивания в открытом грунте весной, летом и осенью. Промежуточная устойчивость к фузариозу Норма высева 1,6-2,0 млн семян на га Устойчив к растрескиванию.",
        "Агро онлайн\nБелая орхидея\nОмск Усадьба",
        R.drawable.p21,
        listOf(
            R.drawable.p21,
            R.drawable.p22,
            R.drawable.p22
        )
    ),

    Vegetables(
        "Перец\nГЕРАКЛ",
        "Высокоурожайный сорт для открытого и защищенного грунта. Вегетационный период 135-145 дней. Плод кубовидной формы, длиной 11-12 см, шириной 10-11 см, толщина стенок 5-7 мм. Окраска в биологической спелости красная, в технической – зеленая. Превосходные вкусовые качества. Универсальное использование.",
        "Агро онлайн\nБелая орхидея\nОмск Усадьба",
        R.drawable.p31,
        listOf(
            R.drawable.p31,
            R.drawable.p32,
            R.drawable.p32
        )
    ),

    Vegetables(
        "Баклажан\nАЛМАЗ",
        "Среднеспелый, от всходов до созревания плодов 110-150 дней. Растение компактное, высотой 45-50 см. Плод цилиндрический длинной 14,4-17,5 см. Массой 100-160 г. Окраска в технической спелости темно-фиолетовая. Мякоть зеленоватая, плотная, без горечи. Вкусовые и технологические качества отличные. Характеризуется высоким ранним урожаем.",
        "Агро онлайн\nБелая орхидея\nОмск Усадьба",
        R.drawable.p41,
        listOf(
            R.drawable.p41,
            R.drawable.p42,
            R.drawable.p42
        )
    ),

    Vegetables(
        "Капуста\nАМАГЕР",
        "Позднеспелый, лежкий сорт. Вегетационный период 95-115 дней. Листья серо-зелёные с восковым налётом. Кочаны округо-плоские, плотные, зелено-белые, массой 3-4,5 кг. Устойчив к растрескиванию. Транспортабельность высокая. Рекомендуется для использования в свежем виде и для хранения (до 5 месяцев).",
        "Агро онлайн\nБелая орхидея\nОмск Усадьба",
        R.drawable.p51,
        listOf(
            R.drawable.p51,
            R.drawable.p52,
            R.drawable.p52
        )
    ),

    Vegetables(
        "Кабачок\nИЗУМРУД",
        "Раннеспелый сорт. Период от полных всходов до начала технической спелости плодов 33-46 дней. Растение кустовое. Плод цилиндрической формы, темно-зеленой окраски с мелкими пятнышками, длинный, среднего диаметра, гладкий, глянцевый, массой 0,9-1,3 кг.",
        "Агро онлайн\nБелая орхидея\nОмск Усадьба",
        R.drawable.p71,
        listOf(
            R.drawable.p71,
            R.drawable.p72,
            R.drawable.p72
        )
    ),


    Vegetables(
        "Капуста\nЧАМП",
        "Новый ранний гибрид для свежего рынка. Созревает через 52-57 дней после пересадки. Растение компактное. Кочаны правильной округлой формы с привлекательной зеленой окраской. Масса кочанов 1-2 кг в зависимости от условий выращивания и плотности посадки. Кочерыжка очень короткая. Гибрид выделяется чрезвычайно высокой плотностью кочанов, превосходной сохраняемостью на корню в поле и толерантностью к растрескиванию. Может храниться в срезанном состоянии достаточно продолжительный период.",
        "Агро онлайн\nБелая орхидея\nОмск Усадьба",
        R.drawable.p81,
        listOf(
            R.drawable.p81,
            R.drawable.p82,
            R.drawable.p82
        )
    ),

    Vegetables(
        "Тыква\nВИТАМИННАЯ",
        "Высокоурожайный позднеспелый сорт. Период созревания 125-130 дней. Растение длинноплетистое, средней мощности. Плоды короткоовальные и цилиндрические, широкие, сегментированные, с ребристостью к плодоножке. При полном созревании окраска буро-коричневая с розовым оттенком. Кора тонкая, кожистая. Мякоть ярко-оранжевая, хрустящая, сладкая, толщиной 5-10см. Масса 6-7 кг.",
        "Агро онлайн\nБелая орхидея\nОмск Усадьба",
        R.drawable.p91,
        listOf(
            R.drawable.p91,
            R.drawable.p92,
            R.drawable.p92
        )
    ),

    Vegetables(
        "Огурец\nМАША",
        "F1 партенокарпический, суперранний из корнишонов, 8-10см., без горечи, с женским типом цветения.",
        "Агро онлайн\nБелая орхидея\nОмск Усадьба",
        R.drawable.p101,
        listOf(
            R.drawable.p101,
            R.drawable.p102,
            R.drawable.p102
        )
    )
)