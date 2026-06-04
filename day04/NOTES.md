# Day 4 Notes — Generics + Streams API

## Topics Covered
- [ ] Generics — Box<T>, Pair<K,V>, bounded generics
- [ ] Streams API — filter, map, reduce, collect
- [ ] Lambda expressions
- [ ] LeetCode #49 Group Anagrams

## Key Concepts

### Generics
```
T = Type (any type)
E = Element (used in collections)
K = Key
V = Value

Box<T>       → single type
Pair<K, V>   → two types
<T extends Number> → bounded (only Number subtypes)
```

### Streams Pipeline
```
collection.stream()
    .filter(condition)     // keep only matching
    .map(transform)        // change each element
    .sorted()              // sort
    .collect(toList())     // get result
```

### Common Stream Operations
| Operation | What it Does | Returns |
|---|---|---|
| filter() | Keep items matching condition | Stream |
| map() | Transform each item | Stream |
| reduce() | Combine all items into one | Single value |
| collect() | Convert stream to list/set/map | Collection |
| count() | Count items | long |
| forEach() | Do something with each item | void |
| sorted() | Sort items | Stream |
| findFirst() | Get first item | Optional |

## What I Learned
(Write here after completing)

## Doubts / Questions
(Write here — ask Copilot tomorrow)

## English Practice
- [ ] Recorded 2-min explanation of "What are Streams in Java?"
