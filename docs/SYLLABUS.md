# DSA Master Checklist (Phases)


---

## Phase 0 — Setup & Java Foundations for DSA
- [ ] Testing
- [ ] Java Collections overview
  - [ ] ArrayList / LinkedList / Deque / ArrayDeque
  - [ ] Stack / Queue / PriorityQueue
  - [ ] HashMap / HashSet / LinkedHash* / TreeMap / TreeSet / Navigable*
  - [ ] Comparator vs Comparable; stability implications
- [ ] Generics (bounds, wildcards), immutability, records
- [ ] Fast I/O; `StringBuilder` vs `String`
- [ ] JUnit basics; assertions; property tests
- [ ] Profiling & benchmarking (JMH)
- [ ] Build tools: Gradle/Maven; IDE debugging; Git basics

---

## Phase 1 — Math & Analysis Prereqs
- [ ] Asymptotic notation: O, Θ, Ω, o, ω; growth-rate ordering
- [ ] Recurrences: substitution, recursion tree, **Master Theorem**, Akra–Bazzi (name)
- [ ] Amortized analysis: aggregate, accounting, **potential method**
- [ ] Probability: expectation, indicator variables, linearity of expectation, (Chernoff intuition)
- [ ] Discrete math: sets, relations, functions, trees, graphs, induction/contradiction
- [ ] Bit tricks: masks, shifts, popcount patterns

---

## Phase 2 — Core Data Structures
- [ ] Arrays vs linked lists (singly/doubly, circular, sentinel)
- [ ] Stacks & queues; monotonic stack/queue
- [ ] Hash tables
  - [ ] Chaining vs open addressing (linear/quadratic/double hashing)
  - [ ] Load factor, resizing, clustering
  - [ ] Cuckoo hashing (awareness)
- [ ] Trees: terminology, height/size; traversals (pre/in/post/level)
- [ ] BST: invariants; ops; degeneracy
- [ ] Heaps: binary, d-ary; heapify; heapsort concept
- [ ] Priority structures (binomial, Fibonacci, pairing — awareness)
- [ ] Union–Find (DSU): path compression + union by rank/size

---

## Phase 3 — Searching, Sorting & Selection
- [ ] Binary search patterns (value/answer; first/last/lower/upper bound)
- [ ] Sorting algorithms
  - [ ] Insertion / Selection / (Bubble minimal)
  - [ ] Merge / Quick (Lomuto/Hoare/3-way) / Heap
  - [ ] Counting / Radix / Bucket; stability & in-place considerations
- [ ] Order statistics: Quickselect; Median of Medians (idea)

---

## Phase 4 — Recursion & Backtracking
- [ ] Recursion mechanics; tail recursion caveat in Java
- [ ] Backtracking templates: subsets, permutations, combinations
- [ ] Classic problems: N-Queens, Sudoku, partitioning
- [ ] Pruning & constraint ordering; memoization vs backtracking

---

## Phase 5 — Classic Problem-Solving Patterns
- [ ] Two pointers; fast/slow (cycle detection)
- [ ] Sliding window (fixed/variable; longest/shortest)
- [ ] Prefix sums / difference arrays (1D/2D)
- [ ] Sweep-line (events, active sets)
- [ ] Greedy: exchange argument, matroid intuition
  - [ ] Interval scheduling / activity selection
  - [ ] Huffman coding (overview)

---

## Phase 6 — Graph Theory & Algorithms
- [ ] Graph representations: list/matrix/edges; weighted/unweighted; directed/undirected
- [ ] BFS/DFS (levels, timestamps); path reconstruction
- [ ] Connectivity: components; SCCs (Kosaraju/Tarjan)
- [ ] Shortest paths: Dijkstra; Bellman–Ford; SPFA pitfalls; DAG shortest path
- [ ] MST: Kruskal (DSU), Prim (heap)
- [ ] Topological sort; DAG DP patterns
- [ ] Bipartite graphs: checks; matching intro
- [ ] Flow & matching (awareness): Edmonds–Karp, Dinic, Hopcroft–Karp
- [ ] Trees-in-graphs: tree DP; LCA (binary lifting/Euler+RMQ); diameter
- [ ] Eulerian vs Hamiltonian basics

---

## Phase 7 — Dynamic Programming (DP)
- [ ] DP principles: optimal substructure; overlapping subproblems; state design
- [ ] 1D DP: LIS (O(n²) & O(n log n)), coin change, knapsack (0/1 & unbounded)
- [ ] 2D & strings: edit distance, LCS, palindrome DP
- [ ] Grid DP: paths, obstacles, min path sum
- [ ] Bitmask DP (TSP small n)
- [ ] DP optimizations (names & intuition): monotonic queue, divide & conquer DP, Knuth

---

## Phase 8 — Range Query & “Advanced Array” Structures
- [ ] Sparse Table (idempotent)
- [ ] Fenwick Tree (BIT): sum; k-th by prefix
- [ ] Segment Tree: range queries; point/range updates; **lazy propagation**
- [ ] Order-statistics trees (augment size)
- [ ] Interval tree; k-d tree (overview); treaps/randomized BSTs

---

## Phase 9 — Strings & Text Algorithms
- [ ] Hashing: polynomial rolling; **Rabin–Karp**; double hashing
- [ ] Exact matching: **KMP** (prefix/pi), **Z-algorithm**
- [ ] Prefix vs Z function (relations & use-cases)
- [ ] Tries: standard & compressed (radix); memory trade-offs; autocomplete
- [ ] Aho–Corasick (multi-pattern)
- [ ] Suffix structures (awareness): suffix array (O(n log n)/O(n)); LCP (Kasai); suffix tree; suffix automaton (idea)

---

## Phase 10 — Geometry (Basics)
- [ ] Orientation tests; collinearity
- [ ] Segment intersection (edge cases)
- [ ] Convex hull: Graham scan / Andrew monotone chain
- [ ] Closest pair (divide & conquer idea)
- [ ] Circle/rectangle overlap; integer vs floating pitfalls

---

## Phase 11 — Number Theory & Combinatorics (for Algos)
- [ ] GCD/LCM; Extended Euclid; fast power; modular arithmetic
- [ ] Primes & sieves (Eratosthenes; segmented)
- [ ] Modular inverse (Fermat / Extended Euclid); CRT (awareness)
- [ ] Counting & binomial coefficients; precompute factorials & inverses
- [ ] Pigeonhole; inclusion–exclusion (intro)

---

## Phase 12 — Randomization & Analysis
- [ ] Randomized quicksort; hashing analysis
- [ ] Reservoir sampling
- [ ] Bloom filter; Count-Min sketch (streaming summaries)
- [ ] Locality-Sensitive Hashing (intuition)
- [ ] Cache-friendliness & data locality basics

---

## Phase 13 — External Memory & Storage Trees (Awareness)
- [ ] B-Trees / B+Trees
- [ ] Paging & block I/O model
- [ ] Log-structured designs (LSM trees)

---

## Phase 14 — Concurrency & Parallel Algorithms (Java)
- [ ] Java Memory Model (happens-before), `volatile`, atomics, locks
- [ ] Concurrent collections (`ConcurrentHashMap`, `ConcurrentLinkedQueue`)
- [ ] Fork/Join; parallel streams caveats
- [ ] Parallel patterns: divide & conquer mergesort; map-reduce intuition

---

## Phase 15 — Complexity Theory (Awareness)
- [ ] Decision problems; reductions
- [ ] P, NP, NP-complete
- [ ] Approximation algorithms (set/vertex cover intuition); PTAS/FPTAS (terms)
- [ ] Parameterized complexity: FPT/XP; kernelization (names)

---

## Phase 16 — Practical Patterns & Capstones
- [ ] “Patterns” library:
  - [ ] two-pointers / sliding window / prefix-suffix
  - [ ] sweep-line / meet-in-the-middle / binary search on answer
  - [ ] greedy proofs / DSU / toposort
  - [ ] shortest paths / tree DP
  - [ ] range queries (Fenwick/SegTree)
  - [ ] tries / KMP / Z / hashing
  - [ ] backtracking + pruning / memoization vs tabulation
- [ ] Testing strategies: randomized/differential testing
- [ ] Capstone (pick one):
  - [ ] Mini search engine (inverted index, boolean queries, TF-IDF-ish, trie autocomplete)
  - [ ] Graph toolkit (BFS/DFS/Dijkstra/Kruskal/Prim)
  - [ ] Range structures library (Fenwick/SegTree/order-statistics)

---

## Java-Specific “Extra Knowledge”
- [ ] Correct `equals()`/`hashCode()` (contracts; collisions; key mutability)
- [ ] `Comparator` design; transitivity; stable vs unstable sorts
- [ ] Performance: `StringBuilder`, primitives vs wrappers, boxing/unboxing costs
- [ ] `PriorityQueue` (min-heap); custom array heap
- [ ] `TreeMap`/`TreeSet` navigation: floor/ceiling/lower/higher
- [ ] Memory/GC awareness; `-Xms/-Xmx`; hidden allocations in hot paths
- [ ] JMH microbench basics

---

## Math/CS “Extra Knowledge”
- [ ] Induction; loop invariants; correctness proofs
- [ ] Amortized potential method (dynamic arrays, multipop, union–find)
- [ ] Probability toolkit (linearity, indicator vars; tail bounds by name)
- [ ] Floating-point pitfalls; when to use `BigInteger/BigDecimal`
- [ ] Recurrences catalog (mergesort, quicksort, Karatsuba — awareness)

---

## Systems/Tooling “Extra Knowledge”
- [ ] Git workflows; experiment branches
- [ ] Read academic pseudocode → careful Java translation (0/1-indexing; overflow)
- [ ] Input models: worst vs average; adversarial; randomized seeding

---

## Optional “Mastery” Tier
- [ ] Advanced Graphs: Dinic; Hopcroft–Karp; SCC DAG; tree DP (rerooting); LCA (binary lifting)
- [ ] DP Optimizations: divide-and-conquer DP; Knuth; monotonic queue optimization; digit DP (overview)
- [ ] Randomization & Streaming: reservoir; Bloom; Count-Min; LSH
- [ ] External Memory & Concurrency: B/B+ Trees; LSM; `ConcurrentHashMap`; fork/join; parallel mergesort
