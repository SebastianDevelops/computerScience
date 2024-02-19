## Recursion

If a function needs to run more than once in the same memory instance, instead of calling that function multiple times one by one, we can use recursion. Have the function call itself.

#### Base condition/case
- Ths is a condition where our function will stop making new calls or when the condition for the recursive function has been reached.

---

- Without a base case, there will be a stackoverflow because the function will be called indefinitely and will overflow the stack.

**NB: You can convert any recurive function into a loop and vice versa.**