//https://school.programmers.co.kr/learn/courses/30/lessons/133499#

class Solution {
    fun solution(babbling: Array<String>): Int {
        var answer: Int = 0
        var tmp = ""
        
        for(b in babbling){
            tmp = b.replace("aya", "1").replace("ye","2").replace("woo","3").replace("ma","4")
            
            try{
                tmp.toInt()
                
                when{
                    tmp.contains("11") -> continue
                    tmp.contains("22") -> continue
                    tmp.contains("33") -> continue
                    tmp.contains("44") -> continue
                    else -> answer++
                }
            }
            catch(e: Exception){
                continue
            }
        }
        return answer
    }
}