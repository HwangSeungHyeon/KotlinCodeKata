//https://school.programmers.co.kr/learn/courses/30/lessons/161990
class Solution {
    fun solution(wallpaper: Array<String>): IntArray {
        var coordinate = arrayListOf(100,100,-1,-1) //lux, luy, rdx, rdy
        
        for((yIdx, y) in wallpaper.withIndex()){
            for((xIdx, ch) in y.withIndex()){
                if(ch == '#'){
                    if(coordinate[0] > yIdx) coordinate[0] = yIdx
                    if(coordinate[1] > xIdx) coordinate[1] = xIdx
                    if(coordinate[2] <= yIdx) coordinate[2] = yIdx+1
                    if(coordinate[3] <= xIdx) coordinate[3] = xIdx+1
                }
            }
        }
        return coordinate.toIntArray()
    }
}