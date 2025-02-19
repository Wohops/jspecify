/*
 * Copyright 2020 The JSpecify Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;
import org.jspecify.annotations.NullnessUnspecified;

@NullMarked
class NullLiteralToTypeVariableUnspec<
    Never1T,
    ChildOfNever1T extends Never1T,
    UnspecChildOfNever1T extends @NullnessUnspecified Never1T,
    NullChildOfNever1T extends @Nullable Never1T,
    //
    Never2T extends Object,
    ChildOfNever2T extends Never2T,
    UnspecChildOfNever2T extends @NullnessUnspecified Never2T,
    NullChildOfNever2T extends @Nullable Never2T,
    //
    UnspecT extends @NullnessUnspecified Object,
    ChildOfUnspecT extends UnspecT,
    UnspecChildOfUnspecT extends @NullnessUnspecified UnspecT,
    NullChildOfUnspecT extends @Nullable UnspecT,
    //
    ParametricT extends @Nullable Object,
    ChildOfParametricT extends ParametricT,
    UnspecChildOfParametricT extends @NullnessUnspecified ParametricT,
    NullChildOfParametricT extends @Nullable ParametricT,
    //
    UnusedT> {
  @NullnessUnspecified Never1T x0() {
    // jspecify_nullness_not_enough_information
    return null;
  }

  @NullnessUnspecified ChildOfNever1T x1() {
    // jspecify_nullness_not_enough_information
    return null;
  }

  @NullnessUnspecified UnspecChildOfNever1T x2() {
    // jspecify_nullness_not_enough_information
    return null;
  }

  @NullnessUnspecified NullChildOfNever1T x3() {
    // jspecify_nullness_not_enough_information
    return null;
  }

  @NullnessUnspecified Never2T x4() {
    // jspecify_nullness_not_enough_information
    return null;
  }

  @NullnessUnspecified ChildOfNever2T x5() {
    // jspecify_nullness_not_enough_information
    return null;
  }

  @NullnessUnspecified UnspecChildOfNever2T x6() {
    // jspecify_nullness_not_enough_information
    return null;
  }

  @NullnessUnspecified NullChildOfNever2T x7() {
    // jspecify_nullness_not_enough_information
    return null;
  }

  @NullnessUnspecified UnspecT x8() {
    // jspecify_nullness_not_enough_information
    return null;
  }

  @NullnessUnspecified ChildOfUnspecT x9() {
    // jspecify_nullness_not_enough_information
    return null;
  }

  @NullnessUnspecified UnspecChildOfUnspecT x10() {
    // jspecify_nullness_not_enough_information
    return null;
  }

  @NullnessUnspecified NullChildOfUnspecT x11() {
    // jspecify_nullness_not_enough_information
    return null;
  }

  @NullnessUnspecified ParametricT x12() {
    // jspecify_nullness_not_enough_information
    return null;
  }

  @NullnessUnspecified ChildOfParametricT x13() {
    // jspecify_nullness_not_enough_information
    return null;
  }

  @NullnessUnspecified UnspecChildOfParametricT x14() {
    // jspecify_nullness_not_enough_information
    return null;
  }

  @NullnessUnspecified NullChildOfParametricT x15() {
    // jspecify_nullness_not_enough_information
    return null;
  }
}
