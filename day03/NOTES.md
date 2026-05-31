# Day 3 Notes

## Topics Covered
- [ ] Exception Handling — try/catch/finally
- [ ] throw vs throws
- [ ] Checked vs Unchecked exceptions
- [ ] Custom Exception classes
- [ ] LeetCode #242 Valid Anagram

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
(Write here after completing)

## Doubts / Questions
(Write here — ask Copilot tomorrow)

## English Practice
- [ ] Recorded 2-min explanation of "What is Exception Handling in Java?"
