package acmicpc
import java.util.*
import kotlin.math.max

    fun main() = with(Scanner(System.`in`)) {
        val n = nextInt()
        val requests = Array(n) { _ -> nextInt() }
        val budget = nextInt()

        var min = 0;
        var max = requests.maxOf {value -> value}
        var result = 0
        while(min<=max) {
            var mid = (min+max)/2
            var calc = calc(mid, requests)
            if(budget >= calc) {
                result = max(result, mid)
                min = mid+1
            } else {
                max = mid-1
            }
        }
        print(result)
    }


    fun calc(max: Int, requests: Array<Int>): Int {
        var sum = 0;
          for (request in requests) sum += when {
            request > max -> max
            else -> request
        }
        return sum;
    }
