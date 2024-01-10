//https://school.programmers.co.kr/learn/courses/30/lessons/150370#
class Solution {
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        var myTerms = terms.map{it.split(" ")}
        
        var (todayY, todayM, todayD) = today.split(".").map{ it.toInt() }
        
        for((idx,p) in privacies.withIndex()){
            var (y, m, d, type) = p.split(".", " ")
            
            var year = y.toInt()
            var month = m.toInt()
            var day = d.toInt()
            
            for(t in myTerms){
                if(type == t[0]){
                    month+=t[1].toInt()
                    
                    while(month > 12){
                        year++
                        month-=12
                    }
                    
                    if(todayY > year){
                        answer+=idx+1
                        continue
                    }
                    else if(todayY == year && todayM > month){
                        answer+=idx+1
                        continue
                    }
                    else if(todayY == year && todayM == month && todayD >= day){
                        answer+=idx+1
                        continue
                    }
                    
                }
            }
        }
        
        answer.sort()
        return answer
    }
}