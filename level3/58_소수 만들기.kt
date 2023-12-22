//https://school.programmers.co.kr/learn/courses/30/lessons/12977
//주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다. 숫자들이 들어있는 배열 nums가 매개변수로 주어질 때, nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.

class Solution {
    fun solution(nums: IntArray): Int {
        var answer = 0
        var numsLastIdx = nums.lastIndex //가장 마지막 
 
        for(x in nums.indices){
            for(y in x+1..numsLastIdx){
                for(z in y+1..numsLastIdx){
                    var sum = nums[x]+nums[y]+nums[z] //서로 다른 3개의 수를 더함
                    
                    var cnt = 0
                    //소수는 1과 자기 자신으로만 나누어떨어지는 수
                    for(n in 1..sum){
                        if(sum%n==0) cnt++ //나누어 떨어지는 수 조사
                    }
                
                    if(cnt == 2) answer++ //나누어 떨어지는 수가 2개(1, 자기자신)일 때 카운트 업!
                }
            }
        }

        return answer
    }
}