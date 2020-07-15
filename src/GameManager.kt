import kotlin.collections.ArrayList

class GameManager(var cost: Int, var playerNum: Int,var totalMoney: Int = 0) {
    lateinit var players: ArrayList<Player>
    lateinit var pokers: ArrayList<Poker>

    //启动游戏
    fun startGame(){
        var pokerManager = PokerManager()
        var playerManager = PlayerManager(playerNum)
        players = playerManager.players
        pokers = pokerManager.pokers
        costMoney()
        givePoker()
        playerManager.showPlayer()
        award(comparePoker())
        playerManager.showFinalMoney()
    }

    //发牌
    fun givePoker(){
        for ((index,item) in players.withIndex()){
           if (players[index].poker.value != -2 && cost != 0)
            item.poker = pokers[index]  //取洗过牌的牌组的第index张赋给当前玩家
        }
    }
    //下注
    fun costMoney(){
        for (item in players) {
            if (item.money >= cost) {
                item.money -= cost
                totalMoney += cost
            }else{
                println("[提示] ${item.name}玩家余额不足")
                item.poker.value = -2       //取消比牌资格
            }
        }
    }
    //比牌
    fun comparePoker(): Player{
        var player:Player = Player("",-1)
        for (item in players){
            if (player.poker.value < item.poker.value) player = item
        }
        if (player.num < 1) {
            println("[提示] 没有玩家参加游戏")
        }else{
            println("[${player.name}] 的牌大过所有人，取得了最终的大奖！")
        }
        return player
    }
    //奖励
    fun award(player: Player){
        player.money += totalMoney
    }


}