//https://school.programmers.co.kr/learn/courses/30/lessons/160586
class Solution {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        
        for(target in targets){
            var sum = 0
            for(t in target){
                var tmp = keymap.map{it.indexOf(t)}.filter{it != -1}
                if(tmp.size == 0){
                    sum = -1
                    break
                }
                else sum+=tmp.minOf{it}+1
            }
            answer += sum
        }
        
        return answer
    }
}