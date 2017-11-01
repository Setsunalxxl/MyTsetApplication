package setsunal.com.mytsetapplication

import android.content.Context
import android.util.AttributeSet
import android.view.View
import java.util.concurrent.locks.Lock

/**
 * Created by Setsunal_xxl on 2017/9/18.
 */
data class Artist(val name: String) {
    fun sum(a: Int): Int {
        return a
    }

    /*This is a block comment
        on multipe lines*/
    fun sum2(a: Int) = a

    //This is an end-of-line comment
    fun printSum(a: Int) {
        var c: Int
        c = 3
        c += 1
        println("sum of $a is ${a + c}")

        when (c) {
            0, 1 -> print("x ==0 or x==1")
            else -> print("otherwise")
        }

        var a = 1
        val s1 = "a is $a"

        a = 2
        val s2 = "${s1.replace("is", "was")},but now is $a"

        val items = listOf<String>("apple", "nanana", "kiwi")
        for (item in items) {
            print(item)
        }

        for (index in items.indices) {
            print("item at $index is ${items[index]}")
        }

        for ((index, value) in items.withIndex()) {
            println("the element at $index is $value")
        }
    }

    fun describe(obj: Any) =
            when (obj) {
                1 -> "one"
                "Hello" -> "Greeting"
                is Long -> "Long"
                else -> "Unknown"
            }

    val a: Int = 1
    val b = 2

    fun maxOf(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }

    fun maxOf2(a: Int, b: Int) = if (a > b) a else b

    fun parseInt(str: String) = str?.length

    fun printProduct(arg1: String, arg2: String): Int {
        val x = parseInt(arg1)
        val y = parseInt(arg2)
        val l = arg1?.length ?: -1

        val listWithNulls: List<String?> = listOf("A", null)
        for (item in listWithNulls) {
            item?.let { print(it) }
        }

        var mapWithNulls: Map<Int?, String?> = mapOf(Pair(1, "2"))
        for (map in mapWithNulls) {
            map?.let { print(it.key) }
        }

        val l1 = arg1!!.length

        val aInt: Int? = x as? Int

        val nullableList: List<Int?> = listOf(1, 2, 3, null, 4)
        val intList: List<Int> = nullableList.filterNotNull()
        if (x != null && y != null) {
            return x * y
        } else {
            return 0
        }

        print("test tag")

    }

    fun getStringLength(obj: Any) = if (obj is String) obj.length else null

    class EmptyBody

    open class Person(val name: String = "Jack") {

        constructor(name: String, person: Person) : this(name) {
        }

        open fun v() {}
    }

    val p = Person("Jack")

    val j = Person()

    open class Base(p: Int)

    class Derived(p: Int) : Base(p)

    class MyView : View {

        constructor(ctx: Context) : super(ctx)

        constructor(ctx: Context, attrs: AttributeSet) : super(ctx, attrs)
    }

    class P(name: String) : Person(name) {
        override fun v() {}
    }

    fun read(b: Array<Byte>, off: Int = 0, len: Int = b.size) {

    }

    open class A {
        open fun foo(i: Int = 10) {

        }
    }

    class B : A() {
        override fun foo(i: Int) {

        }
    }

    fun <T> lock(lock: Lock, body: () -> T): T {
        lock.lock()
        try {
            return body()
        } finally {
            lock.unlock()
        }
    }
}