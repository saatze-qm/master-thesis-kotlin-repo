// IGNORE_BACKEND: WASM
// FILE: test.kt

fun box() {
    A().test()
}

class A {
    fun test() {
        //Breakpoint!
        foo()
        prop
        prop = 2
    }

    companion object {
        private fun foo() {
            val a = 1
        }

        private var prop: Int = 2
            get() {
                return 1
            }
            set(i: Int) {
                field = i
            }
    }
}

// EXPECTATIONS JVM JVM_IR
// test.kt:5 box
// test.kt:21 <clinit>
// test.kt:16 <init>
// test.kt:21 <clinit>
// test.kt:21 <clinit>
// test.kt:5 box

// test.kt:8 <init>
// test.kt:5 box
// test.kt:11 test
// test.kt:18 foo
// test.kt:19 foo
// test.kt:12 test
// test.kt:23 getProp
// test.kt:12 test
// test.kt:13 test
// test.kt:26 setProp
// test.kt:27 setProp
// test.kt:14 test
// test.kt:6 box

// EXPECTATIONS JS_IR
// test.kt:5 box
// test.kt:8 <init>
// test.kt:21 <init>
// test.kt:16 <init>
// test.kt:8 <init>
// test.kt:5 box
// test.kt:11 test
// test.kt:11 test
// test.kt:18 foo
// test.kt:19 foo
// test.kt:12 test
// test.kt:12 test
// test.kt:23 <get-prop>
// test.kt:13 test
// test.kt:14 test
// test.kt:6 box
