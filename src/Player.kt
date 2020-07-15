import moneyNum.Companion.moneyValue

class Player(var name: String, var num: Int, var money: Int = moneyValue){
    var poker: Poker = Poker("no","",-1)
    override fun toString(): String ="[${num}号玩家]$name \t[余额]$money \t[持有牌]$poker\n"

    fun finalMoney(): String = "[${num}号玩家]$name \t[余额]$money \n"
}

interface moneyNum{
    //确定玩家默认金钱数
    companion object{
        const val moneyValue = 100
    }
}