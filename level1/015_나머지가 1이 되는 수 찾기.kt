// https://school.programmers.co.kr/learn/courses/30/lessons/87389
// 자연수 n이 매개변수로 주어집니다. n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요. 답이 항상 존재함은 증명될 수 있습니다.

class Solution {
    //(1..n) => 1에서 n까지 범위 지정
    //filter{n%it==1} => n을 it(1부터 n사이의 어떤 수)로 나눴을 때 나머지가 1인 것만 가져옴
    //minOf{it} => 가져온 숫자 중에서 가장 작은 수를 가져옴
    fun solution(n: Int) = (1..n).filter{n%it==1}.minOf{it}
}