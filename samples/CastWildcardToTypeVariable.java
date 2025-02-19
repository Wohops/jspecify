/*
 * Copyright 2021 The JSpecify Authors.
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

@NullMarked
class CastWildcardToTypeVariable {
  <T> T x(NullableSupplier<?> supplier) {
    // jspecify_nullness_mismatch
    return (T) supplier.get();
  }

  interface NullableSupplier<T extends @Nullable Object> {
    T get();
  }

  <T> T x(NonNullSupplier<?> supplier) {
    return (T) supplier.get();
  }

  interface NonNullSupplier<T> {
    T get();
  }
}
