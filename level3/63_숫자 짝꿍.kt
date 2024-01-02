//https://school.programmers.co.kr/learn/courses/30/lessons/131128
class Solution {
    fun solution(X: String, Y: String): String {
        var answer: String = ""
        
        for(n in 9 downTo 0){
            var cntX = X.count{it == "$n"[0]}
            var cntY = Y.count{it == "$n"[0]}
            
            answer += "$n".repeat(if(cntX < cntY) cntX else cntY)
        }
        
        if(answer == "") answer = "-1" //공통되는 게 없을 경우 -1 반환
        else if(answer[0] == "0"[0]) answer="0" //공통되는 게 0만 있을 경우 0 반환
        
        return answer
    }
}