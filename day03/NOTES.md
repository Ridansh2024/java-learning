# Day 3 Notes

## Topics Covered
- [x] Exception Handling — try/catch/finally
- [x] throw vs throws
- [x] Checked vs Unchecked exceptions
- [ ] Custom Exception classes
- [x] LeetCode #242 Valid Anagram

## Key Concepts

### Exception Hierarchy
```
Throwable
├── Error (serious — don't catch)
│   └── OutOfMemoryError, StackOverflowError
└── Exception
    ├── Checked (compile-time) — MUST handle
    │   └── IOException, SQLException, FileNotFoundException
    └── Unchecked (runtime) — optional to handle
        └── NullPointerException, ArrayIndexOutOfBounds, ArithmeticException
```

### throw vs throws
| Keyword | Where | Purpose |
|---------|-------|---------|
| throw | Inside method | Actually throw an exception |
| throws | Method signature | Declare that method CAN throw |

## What I Learned

### Exception Handling
- `try` block contains risky code that might throw an exception
- `catch` block handles the specific exception
- `finally` block ALWAYS runs (cleanup code)
- `throw` creates and throws an exception inside a method
- `throws` declares that a method might throw an exception (caller must handle)

### Valid Anagram (LeetCode #242)
- **Approach 1: HashMap** — count chars in `s`, decrease for `t`, check no count < 0
- **Approach 2: int[26] array** — increment for `s`, decrement for `t`, check all zeros

### Time Complexity
| Approach | Time | Space |
|----------|------|-------|
| Brute force (nested loops) | O(n²) | O(1) |
| Sorting both strings | O(n log n) | O(n) |
| HashMap | O(n) | O(n) |
| int[26] array | O(n) | O(1) ← best |

## Doubts / Questions
(Write here — ask Copilot tomorrow)

## English Practice
- [ ] Recorded 2-min explanation of "What is Exception Handling in Java?"
