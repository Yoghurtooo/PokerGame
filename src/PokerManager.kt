class PokerManager(val pics: ArrayList<String> = arrayListOf<String>("♦","♣","♥","♠"),
                   val dots: ArrayList<String> = arrayListOf<String>("A","2","3","4","5","6","7","8","9","10","J","Q","K"),
                   var pokers: ArrayList<Poker> = arrayListOf<Poker>(),
                   var value: Int = 0) {
    //value：记录牌的大小顺序 0到51

    init {
        producePokers()
        shufflePokers()
        //showPokers()
    }
    //生成扑克牌
    fun producePokers(){
        for (i in 0..12){
            for (j in 0..3){
                pokers.add(Poker(dots[i],pics[j],value))
                if (value <= 51) {value += 1}
            }
        }
    }
    //洗牌
    fun shufflePokers(){
        pokers.shuffle()
    }
    //展示牌组
    fun showPokers(){
        for (item:Poker in pokers){
            print("$item ")
        }
    }

}