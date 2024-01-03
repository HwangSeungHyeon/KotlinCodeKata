//https://school.programmers.co.kr/learn/courses/30/lessons/155652
class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        var answer: String = ""
        var skipAscii = skip.map{it.toInt()}
        
        //97(a)~122(z)
        for(ch in s){
            var tmp = ch.toInt()
            var cnt = 0
            
            while(cnt != index){
                tmp++
                if(tmp > 122){
                    tmp -= 26
                }
                if(!skipAscii.contains(tmp)) cnt++
            }
            answer += tmp.toChar()
        }
        
        return answer
    }
}