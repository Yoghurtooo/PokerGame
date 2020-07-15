import kotlin.collections.ArrayList

class PlayerManager(var people: Int,var players: ArrayList<Player> = arrayListOf<Player>()) {
    init {
        pInformation()
    }
    //输入玩家信息
    fun pInformation(){
        for (i in 1..people){
            print("请输入第${i}名玩家的名字：")
            players.add(Player(readLine().toString(),i))
        }
    }
    //展示玩家目前金额
    fun showFinalMoney(){
        for (item in players){
            print(item.finalMoney())
        }
    }
    //展示当前玩家
    fun showPlayer(){
        for (item in players){
            print(item)
        }
    }
}