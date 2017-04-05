# npm-compile-test

A Clojure library designed to test the compilation of autobahn.js with the npm-dep of clojurescript


## Usage

```
lein deps
npm install
lein cljsbuild once
```

## Error Message

While compiling, the following error is thrown:

```
   lein cljsbuild once                                                                                                                                                                                                                                          1 ↵  2506  16:17:41 
   Compiling ClojureScript.
   Compiling "resources/autobahn_cljs.js" from ["src"]...
   Compiling "resources/autobahn_cljs.js" failed.
   java.lang.NullPointerException
           at com.google.javascript.jscomp.ProcessCommonJSModules.getScopeInsertionPoint(ProcessCommonJSModules.java:242)
           at com.google.javascript.jscomp.ProcessCommonJSModules.access$400(ProcessCommonJSModules.java:42)
           at com.google.javascript.jscomp.ProcessCommonJSModules$FindImportsAndExports.addGoogProvide(ProcessCommonJSModules.java:556)
           at com.google.javascript.jscomp.ProcessCommonJSModules.process(ProcessCommonJSModules.java:125)
           at com.google.javascript.jscomp.Compiler.processAMDAndCommonJSModules(Compiler.java:1841)
           at com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:1549)
           at com.google.javascript.jscomp.Compiler.parse(Compiler.java:809)
           at cljs.closure$eval5980$fn__5981.invoke(closure.clj:1601)
           at clojure.lang.MultiFn.invoke(MultiFn.java:238)
           at cljs.closure$process_js_modules$fn__6251.invoke(closure.clj:2156)
           at clojure.core$map$fn__4785.invoke(core.clj:2646)
           at clojure.lang.LazySeq.sval(LazySeq.java:40)
           at clojure.lang.LazySeq.seq(LazySeq.java:49)
           at clojure.lang.RT.seq(RT.java:521)
           at clojure.core$seq__4357.invokeStatic(core.clj:137)
           at clojure.core$apply.invokeStatic(core.clj:641)
           at clojure.core$mapcat.invokeStatic(core.clj:2674)
           at clojure.core$mapcat.doInvoke(core.clj:2674)
           at clojure.lang.RestFn.invoke(RestFn.java:423)
           at cljs.closure$process_js_modules.invokeStatic(closure.clj:2155)
           at cljs.closure$process_js_modules.invoke(closure.clj:2127)
           at cljs.closure$build.invokeStatic(closure.clj:2229)
           at cljs.closure$build.invoke(closure.clj:2216)
           at cljs.closure$build.invokeStatic(closure.clj:2219)
           at cljs.closure$build.invoke(closure.clj:2216)
           at cljsbuild.compiler$compile_cljs$fn__6424.invoke(compiler.clj:81)
           at cljsbuild.compiler$compile_cljs.invokeStatic(compiler.clj:80)
           at cljsbuild.compiler$compile_cljs.invoke(compiler.clj:69)
           at cljsbuild.compiler$run_compiler.invokeStatic(compiler.clj:187)
           at cljsbuild.compiler$run_compiler.invoke(compiler.clj:143)
           at user$eval6558$iter__6594__6598$fn__6599$fn__6617.invoke(form-init8848799542314272754.clj:1)
           at user$eval6558$iter__6594__6598$fn__6599.invoke(form-init8848799542314272754.clj:1)
           at clojure.lang.LazySeq.sval(LazySeq.java:40)
           at clojure.lang.LazySeq.seq(LazySeq.java:49)
           at clojure.lang.RT.seq(RT.java:521)
           at clojure.core$seq__4357.invokeStatic(core.clj:137)
           at clojure.core$dorun.invokeStatic(core.clj:3024)
           at clojure.core$doall.invokeStatic(core.clj:3039)
           at clojure.core$doall.invoke(core.clj:3039)
           at user$eval6558.invokeStatic(form-init8848799542314272754.clj:1)
           at user$eval6558.invoke(form-init8848799542314272754.clj:1)
           at clojure.lang.Compiler.eval(Compiler.java:6927)
           at clojure.lang.Compiler.eval(Compiler.java:6917)
           at clojure.lang.Compiler.load(Compiler.java:7379)
           at clojure.lang.Compiler.loadFile(Compiler.java:7317)
           at clojure.main$load_script.invokeStatic(main.clj:275)
           at clojure.main$init_opt.invokeStatic(main.clj:277)
           at clojure.main$init_opt.invoke(main.clj:277)
           at clojure.main$initialize.invokeStatic(main.clj:308)
           at clojure.main$null_opt.invokeStatic(main.clj:342)
           at clojure.main$null_opt.invoke(main.clj:339)
           at clojure.main$main.invokeStatic(main.clj:421)
           at clojure.main$main.doInvoke(main.clj:384)
           at clojure.lang.RestFn.invoke(RestFn.java:421)
           at clojure.lang.Var.invoke(Var.java:383)
           at clojure.lang.AFn.applyToHelper(AFn.java:156)
           at clojure.lang.Var.applyTo(Var.java:700)
           at clojure.main.main(main.java:37)
   Subprocess failed

```

## License

Copyright © 2017 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
