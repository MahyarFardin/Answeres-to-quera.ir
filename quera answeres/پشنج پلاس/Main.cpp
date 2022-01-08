/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <cmath>
#include <iostream>
#include <set>

using namespace std;

size_t combination(size_t, size_t);
void init_dist(int[][2], set<int>);
void sort_dist(int[][2], int);

int main() {
  set<int> input;
  size_t n;
  cin >> n;
  for (size_t i = 0; i < n; i++) {
    int location_lable;
    cin >> location_lable;
    input.insert(location_lable);
  }

  size_t dist_size = combination(input.size(), 2);
  int dist[dist_size][2];
  init_dist(dist, input);

  sort_dist(dist, dist_size);
  for (size_t i = 0; i < dist_size; i++)
    cout << '[' << dist[i][0] << ", " << dist[i][1] << ']' << endl;

  return 0;
}

size_t combination(size_t n, size_t r) {
  // Ð“(x + 1) = x!
  return tgamma(n + 1) / (tgamma(r + 1) * tgamma(n - r + 1));
}

void init_dist(int dist[][2], set<int> input) {
  const string ERROR_MSG =
      "somebody fucked the init_dist or combination function!";

  size_t dist_size = combination(input.size(), 2);
  size_t dist_index = 0;

  set<int>::iterator itr_i;
  set<int>::iterator itr_j;

  for (itr_i = input.begin(); itr_i != prev(input.end(), 1); itr_i++)
    for (itr_j = next(itr_i, 1); itr_j != input.end(); itr_j++) {
      if (dist_index >= dist_size)
        throw out_of_range(ERROR_MSG);
      dist[dist_index][0] = min(*itr_i, *itr_j);
      dist[dist_index][1] = max(*itr_i, *itr_j);
      dist_index++;
    }
}

void sort_dist(int dist[][2], int dist_size) {
  for (size_t i = 0; i < dist_size - 1; i++)
    for (size_t j = i + 1; j < dist_size; j++) {
      size_t selection = abs(dist[i][0] - dist[i][1]);
      size_t comparison = abs(dist[j][0] - dist[j][1]);

      if (selection > comparison)
        swap(dist[i], dist[j]);
      else if (selection == comparison && dist[i][0] > dist[j][0])
        swap(dist[i], dist[j]);
    }
}
