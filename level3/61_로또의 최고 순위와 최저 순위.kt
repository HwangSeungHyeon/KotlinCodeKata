//https://school.programmers.co.kr/learn/courses/30/lessons/77484
//당첨 가능한 최고 순위와 최저 순위를 차례대로 배열에 담아서 return 하도록 solution 함수를 완성해주세요.
class Solution {
    //lottos: 민우가 구매한 로또 번호가 담긴 배열
    //win_nums: 로또 당첨 번호를 담은 배열
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var answer = ArrayList<Int>()
        var used = ArrayList<Int>()
        
        for(l in lottos){
            if(l!=0) used.add(l)
        }
        
        var maxCnt = 0
        var minCnt = 0
        
        for(l in lottos){
            if(l == 0){ //모르는 숫자일 경우
                for(num in 1..45){
                    if(!used.contains(num) && win_nums.contains(num)){
                        maxCnt++
                        used.add(num)
                        break
                    }
                }
            }
            else{ //아는 숫자일 경우
                if(win_nums.contains(l)){
                    maxCnt++
                    minCnt++
                }
            }
        }
        
        answer.add(ranking(maxCnt))
        answer.add(ranking(minCnt))
        return answer.toIntArray()
    }
}

fun ranking(cnt: Int): Int{
    return when{
        cnt == 6 -> 1
        cnt == 5 -> 2
        cnt == 4 -> 3
        cnt == 3 -> 4
        cnt == 2 -> 5
        else -> 6
    }
}