// https://school.programmers.co.kr/learn/courses/30/lessons/68935
/*자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요. */

class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        var intList = ArrayList<Int>()
        var tmpN = n
        
        
        //앞뒤 반전된 3진법 결과가 intList에 저장됨
        while(tmpN>0){
            intList.add((tmpN%3))   //3으로 나눈 나머지를 리스트에 더함
            tmpN /= 3
        }
        
        var listSize = intList.size-1
        
        for(i in intList){
            answer += i*(3.0.pow(listSize)).toInt()
            listSize--
        }
        
        
        return answer
    }
}