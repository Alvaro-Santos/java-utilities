/*
The MIT License:
Copyright (c) 2019, �lvaro Ant�nio Santos

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/
package tuples;

class MutableSingleClass<A> implements MutableSingle<A> {
	private static final long serialVersionUID = 1L;

	private A first;

	public MutableSingleClass() {}

	public MutableSingleClass(final A first) {
		this.first = first;
	}

	@Override
	public A first() {
		return this.first;
	}

	@Override
	public void first(final A first) {
		this.first = first;
	}

	@Override
	public boolean equals(Object other) {
		if(other == this) {
			return true;
		}

		if(other == null) {
			return false;
		}

		if(!(other instanceof Single)) {
			return false;
		}

		@SuppressWarnings("rawtypes")
		final Single single = (Single) other;

		return single.first().equals(this.first());
	}

	@Override
	public int hashCode() {
		return this.first().hashCode();
	}

	@Override
	public String toString() {
		return "(" + this.first() + ")";
	}
}
