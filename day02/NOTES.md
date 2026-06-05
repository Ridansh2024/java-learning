# Day 2 Notes

## Topics Covered
- [x] Collections — ArrayList, HashMap, HashSet
- [x] When to use which collection?
- [x] Comparator for sorting
- [x] LeetCode #217 Contains Duplicate

## Key Concepts

### ArrayList vs HashMap vs HashSet
| Collection | Use When | Time Complexity (Search) |
|-----------|----------|-------------------------|
| ArrayList | Ordered list, access by index | O(n) |
| HashMap | Key-value lookup | O(1) |
| HashSet | Check existence, no duplicates | O(1) |

## What I Learned

### ArrayList
- Ordered, allows duplicates, access by index
- `add()`, `remove()`, `get(index)`, `size()`
- Use when you need ordered data or iteration

### HashMap
- Stores key-value pairs, O(1) lookup by key
- `put(key, value)`, `get(key)`, `containsKey()`, `remove()`
- Keys are unique — same key overwrites old value
- Used in EmployeeManager for quick ID lookup

### HashSet
- Stores unique values only, O(1) for `add()` and `contains()`
- `add()` returns `false` if element already exists
- Used in ContainsDuplicate to detect duplicates

### Comparator for Sorting
- `list.sort((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))` — sorts ascending
- Lambda expression replaces anonymous class

### Contains Duplicate (LeetCode #217)
- **HashSet approach** — `if (!seen.add(num))` means duplicate found
- Time: O(n), Space: O(n)
- `add()` returns false if already in set — one line check!

## Doubts / Questions
(Write here — ask Copilot tomorrow)

## English Practice
- [ ] Recorded 2-min explanation of "ArrayList vs HashMap"
