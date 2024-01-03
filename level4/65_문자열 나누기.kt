//https://school.programmers.co.kr/learn/courses/30/lessons/140108
class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        var str = s
        
        while(str != ""){
            var x = str[0]
            var tmp = 0
            var equalCnt = 0
            var cnt = 0
            
            for((idx,ch) in str.withIndex()){
                if(ch == x) equalCnt++
                else cnt++
                
                if(equalCnt == cnt){
                    tmp = idx
                    break
                }
            }
            if(equalCnt == cnt){
                str = str.substring(tmp+1)
                answer++
            }
            else{
                str = ""
                answer++
            }
        }
        return answer
    }
}