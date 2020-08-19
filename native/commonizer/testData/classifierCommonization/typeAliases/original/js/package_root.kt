class A

// Lifted up type aliases:
typealias B = A // class at the RHS
typealias C = B // TA at the RHS, expanded to the same class
typealias C2 = C // 2x TA at the RHS, expanded to the same class
typealias C3 = C2 // 3x TA at the RHS, expanded to the same class

typealias D = B // class/TA expanded to the same class at the RHS
typealias E = C // different TAs expanded to the same class at the RHS

typealias F = List<String> // parameterized type at the RHS
typealias G = List<Int> // different parameterized types at the RHS

typealias H<T> = List<T> // TA with own parameters
typealias I<T> = List<T> // TAs with own parameters with different names

typealias J<T> = Function<T> // function type at the RHS
typealias K<T> = Function<T> // function types with different type parameter names
typealias L<T> = () -> T // different kinds of function types
typealias M = () -> Unit // same return type
typealias N = () -> Any // different return types
typealias O = (String) -> Int // same argument type
typealias P = (Int) -> Int // different argument types

typealias Q<T> = (List<M>) -> Map<T, O> // something complex
typealias R = Function<C> // something complex

// Type aliases converted to expect classes:
typealias S = String
typealias T = Int

// Nullability:
typealias U = A // same nullability of the RHS class
typealias V = A? // different nullability of the RHS class
typealias W = U // same nullability of the RHS TA
typealias X = U? // different nullability of the RHS TA
typealias Y = V // TA at the RHS with the different nullability of own RHS
