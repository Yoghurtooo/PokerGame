import java.util.*

fun main() {
    var scanner = Scanner(System.`in`)
    print("请输入玩家人数: ")
    var playerNum = scanner.nextInt()
    print("请输入本场每位玩家的底注: ")
    var cost = scanner.nextInt()
    GameManager(cost, playerNum).startGame()

}