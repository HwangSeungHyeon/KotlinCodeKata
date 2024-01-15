//https://school.programmers.co.kr/learn/courses/30/lessons/178871
class Solution {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        var playersList = players.toMutableList()
        
        var playersMap = players.map { it to players.indexOf(it) }.toMap().toMutableMap() //수정 가능한 map으로 변환
        
        for(calling in callings){ //callings는 100만개까지 존재!
            var current = playersMap[calling] ?: continue //index
            
            var previous = current-1
            var previousPlayer = playersList[previous]
            
            /*SWAP*/
            var tmp = calling
            playersList[current] = previousPlayer
            playersList[previous] = calling
            
            playersMap[calling] = previous
            playersMap[previousPlayer] = current
            /*SWAP*/
        }
        
        return playersList.toTypedArray()
    }
}