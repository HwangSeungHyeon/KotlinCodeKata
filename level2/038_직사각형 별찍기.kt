// https://school.programmers.co.kr/learn/courses/30/lessons/12969

/*이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.*/

fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt) //a와 b를 한줄로 입력받으면 공백을 기준으로 나눈 후, 
    
    for(idx1 in 0..b-1){ // 세로에 찍을 별의 개수
        for(idx2 in 0..a-1){ //가로에 찍을 별의 개수
            print('*')
        }
        println()
    }
}