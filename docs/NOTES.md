# DSA Master Checklist (Phases)

---

## Phase 0 — Setup & Java Foundations for DSA
### **0.0 Testing:**

using CalculatorTest.java inside testing.
use assertj for better logging details.

0.0.1: parameterized test
    flag: `@parameterizedTest`
    argument sources:

     `@ValueSource( Annotation = {var1, var2, var3.... etc} );`
| Annotation Parameter | Type     | Example                        |
|----------------------|----------|--------------------------------|
| strings              | String[] | {"hello", "world", "JUnit"}    |
| ints                 | int[]    | {1, 5, 100}                     |
| doubles              | double[] | {1.0, 5.5, 9.9}                 |

    `@ParameterizedTest
    @CsvSource({
        "1,2,3",
        "2,3,5",
        "3,4,8"
    })

    void testAdd (int a, int b, int res) {}`



    ` @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)`
    need to put the csv file inside test/resources/data.csv
    see code      

    #### Mockito: used to mock or replicate objects : mimicks the outputs of the mocked object that is used to test a dependent method.
       



0.1 Java Collections overview  
 0.1.1 ArrayList / LinkedList / Deque / ArrayDeque  
 0.1.2 Stack / Queue / PriorityQueue  
 0.1.3 HashMap / HashSet / LinkedHash* / TreeMap / TreeSet / Navigable*  
 0.1.4 Comparator vs Comparable; stability implications  
0.2 Generics (bounds, wildcards), immutability, records  
0.3 Fast I/O; `StringBuilder` vs `String`  
0.4 JUnit basics; assertions; property tests  
0.5 Profiling & benchmarking (JMH)  
0.6 Build tools: Gradle/Mave n; IDE debugging; Git basics  

---

## Phase 1 — Math & Analysis Prereqs
1.1 Asymptotic notation: O, Θ, Ω, o, ω; growth-rate ordering  
1.2 Recurrences: substitution, recursion tree, Master Theorem, Akra–Bazzi  
1.3 Amortized analysis: aggregate, accounting, potential method  
1.4 Probability: expectation, indicator variables, linearity of expectation, Chernoff intuition  
1.5 Discrete math: sets, relations, functions, trees, graphs, induction/contradiction  
1.6 Bit tricks: masks, shifts, popcount patterns  

---

## Phase 2 — Core Data Structures
2.1 Arrays vs linked lists (singly/doubly, circular, sentinel)  
2.2 Stacks & queues; monotonic stack/queue  
2.3 Hash tables  
 2.3.1 Chaining vs open addressing (linear/quadratic/double hashing)  
 2.3.2 Load factor, resizing, clustering  
 2.3.3 Cuckoo hashing (awareness)  
2.4 Trees: terminology, height/size; traversals (pre/in/post/level)  
2.5 BST: invariants; ops; degeneracy  
2.6 Heaps: binary, d-ary; heapify; heapsort concept  
2.7 Priority structures (binomial, Fibonacci, pairing — awareness)  
2.8 Union–Find (DSU): path compression + union by rank/size  

---

## Phase 3 — Searching, Sorting & Selection
3.1 Binary search patterns (value/answer; first/last/lower/upper bound)  
3.2 Sorting algorithms  
 3.2.1 Insertion / Selection / (Bubble minimal)  
 3.2.2 Merge / Quick (Lomuto/Hoare/3-way) / Heap  
 3.2.3 Counting / Radix / Bucket; stability & in-place considerations  
3.3 Order statistics: Quickselect; Median of Medians (idea)  

---

## Phase 4 — Recursion & Backtracking
4.1 Recursion mechanics; tail recursion caveat in Java  
4.2 Backtracking templates: subsets, permutations, combinations  
4.3 Classic problems: N-Queens, Sudoku, partitioning  
4.4 Pruning & constraint ordering; memoization vs backtracking  

---

## Phase 5 — Classic Problem-Solving Patterns
5.1 Two pointers; fast/slow (cycle detection)  
5.2 Sliding window (fixed/variable; longest/shortest)  
5.3 Prefix sums / difference arrays (1D/2D)  
5.4 Sweep-line (events, active sets)  
5.5 Greedy: exchange argument, matroid intuition  
 5.5.1 Interval scheduling / activity selection  
 5.5.2 Huffman coding (overview)  

---

## Phase 6 — Graph Theory & Algorithms
6.1 Graph representations: list/matrix/edges; weighted/unweighted; directed/undirected  
6.2 BFS/DFS (levels, timestamps); path reconstruction  
6.3 Connectivity: components; SCCs (Kosaraju/Tarjan)  
6.4 Shortest paths: Dijkstra; Bellman–Ford; SPFA pitfalls; DAG shortest path  
6.5 MST: Kruskal (DSU), Prim (heap)  
6.6 Topological sort; DAG DP patterns  
6.7 Bipartite graphs: checks; matching intro  
6.8 Flow & matching (awareness): Edmonds–Karp, Dinic, Hopcroft–Karp  
6.9 Trees-in-graphs: tree DP; LCA (binary lifting/Euler+RMQ); diameter  
6.10 Eulerian vs Hamiltonian basics  

---

## Phase 7 — Dynamic Programming (DP)
7.1 DP principles: optimal substructure; overlapping subproblems; state design  
7.2 1D DP: LIS (O(n²) & O(n log n)), coin change, knapsack (0/1 & unbounded)  
7.3 2D & strings: edit distance, LCS, palindrome DP  
7.4 Grid DP: paths, obstacles, min path sum  
7.5 Bitmask DP (TSP small n)  
7.6 DP optimizations: monotonic queue, divide & conquer DP, Knuth  

---

## Phase 8 — Range Query & Advanced Array Structures
8.1 Sparse Table (idempotent)  
8.2 Fenwick Tree (BIT): sum; k-th by prefix  
8.3 Segment Tree: range queries; point/range updates; lazy propagation  
8.4 Order-statistics trees (augment size)  
8.5 Interval tree; k-d tree (overview); treaps/randomized BSTs  

---

## Phase 9 — Strings & Text Algorithms
9.1 Hashing: polynomial rolling; Rabin–Karp; double hashing  
9.2 Exact matching: KMP (prefix/pi), Z-algorithm  
9.3 Prefix vs Z function (relations & use-cases)  
9.4 Tries: standard & compressed (radix); memory trade-offs; autocomplete  
9.5 Aho–Corasick (multi-pattern)  
9.6 Suffix structures (awareness): suffix array (O(n log n)/O(n)); LCP (Kasai); suffix tree; suffix automaton (idea)  

---

## Phase 10 — Geometry (Basics)
10.1 Orientation tests; collinearity  
10.2 Segment intersection (edge cases)  
10.3 Convex hull: Graham scan / Andrew monotone chain  
10.4 Closest pair (divide & conquer idea)  
10.5 Circle/rectangle overlap; integer vs floating pitfalls  

---

## Phase 11 — Number Theory & Combinatorics (for Algos)
11.1 GCD/LCM; Extended Euclid; fast power; modular arithmetic  
11.2 Primes & sieves (Eratosthenes; segmented)  
11.3 Modular inverse (Fermat / Extended Euclid); CRT (awareness)  
11.4 Counting & binomial coefficients; precompute factorials & inverses  
11.5 Pigeonhole; inclusion–exclusion (intro)  

---

## Phase 12 — Randomization & Analysis
12.1 Randomized quicksort; hashing analysis  
12.2 Reservoir sampling  
12.3 Bloom filter; Count-Min sketch (streaming summaries)  
12.4 Locality-Sensitive Hashing (intuition)  
12.5 Cache-friendliness & data locality basics  

---

## Phase 13 — External Memory & Storage Trees (Awareness)
13.1 B-Trees / B+Trees  
13.2 Paging & block I/O model  
13.3 Log-structured designs (LSM trees)  

---

## Phase 14 — Concurrency & Parallel Algorithms (Java)
14.1 Java Memory Model (happens-before), `volatile`, atomics, locks  
14.2 Concurrent collections (`ConcurrentHashMap`, `ConcurrentLinkedQueue`)  
14.3 Fork/Join; parallel streams caveats  
14.4 Parallel patterns: divide & conquer mergesort; map-reduce intuition  

---

## Phase 15 — Complexity Theory (Awareness)
15.1 Decision problems; reductions  
15.2 P, NP, NP-complete  
15.3 Approximation algorithms (set/vertex cover intuition); PTAS/FPTAS (terms)  
15.4 Parameterized complexity: FPT/XP; kernelization (names)  

---

## Phase 16 — Practical Patterns & Capstones
16.1 “Patterns” library  
 16.1.1 Two-pointers / sliding window / prefix-suffix  
 16.1.2 Sweep-line / meet-in-the-middle / binary search on answer  
 16.1.3 Greedy proofs / DSU / toposort  
 16.1.4 Shortest paths / tree DP  
 16.1.5 Range queries (Fenwick/SegTree)  
 16.1.6 Tries / KMP / Z / hashing  
 16.1.7 Backtracking + pruning / memoization vs tabulation  
16.2 Testing strategies: randomized/differential testing  
16.3 Capstone (pick one)  
 16.3.1 Mini search engine (inverted index, boolean queries, TF-IDF-ish, trie autocomplete)  
 16.3.2 Graph toolkit (BFS/DFS/Dijkstra/Kruskal/Prim)  
 16.3.3 Range structures library (Fenwick/SegTree/order-statistics)  

---

## Phase 17 — Java-Specific “Extra Knowledge”
17.1 Correct `equals()` / `hashCode()` (contracts; collisions; key mutability)  
17.2 `Comparator` design; transitivity; stable vs unstable sorts  
17.3 Performance: `StringBuilder`, primitives vs wrappers, boxing/unboxing costs  
17.4 `PriorityQueue` (min-heap); custom array heap  
17.5 `TreeMap` / `TreeSet` navigation: floor / ceiling / lower / higher  
17.6 Memory / GC awareness; `-Xms` / `-Xmx`; hidden allocations in hot paths  
17.7 JMH microbench basics  

---

## Phase 18 — Math/CS “Extra Knowledge”
18.1 Induction; loop invariants; correctness proofs  
18.2 Amortized potential method (dynamic arrays, multipop, union–find)  
18.3 Probability toolkit (linearity, indicator vars; tail bounds by name)  
18.4 Floating-point pitfalls; when to use `BigInteger` / `BigDecimal`  
18.5 Recurrences catalog (mergesort, quicksort, Karatsuba — awareness)  

---

## Phase 19 — Systems/Tooling “Extra Knowledge”
19.1 Git workflows; experiment branches  
19.2 Read academic pseudocode → careful Java translation (0/1-indexing; overflow)  
19.3 Input models: worst vs average; adversarial; randomized seeding  

---

## Phase 20 — Optional “Mastery” Tier
20.1 Advanced Graphs  
 20.1.1 Dinic; Hopcroft–Karp; SCC DAG; tree DP (rerooting); LCA (binary lifting)  
20.2 DP Optimizations  
 20.2.1 Divide-and-conquer DP; Knuth; monotonic queue optimization; digit DP (overview)  
20.3 Randomization & Streaming  
 20.3.1 Reservoir; Bloom; Count-Min; LSH  
20.4 External Memory & Concurrency  
 20.4.1 B/B+ Trees; LSM; `ConcurrentHashMap`; fork/join; parallel mergesort  
