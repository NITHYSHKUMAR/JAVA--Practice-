package javapractice;
class Perfectsum{
      bool findTriplets(int arr[], int n)
      { 
          for (int i = 0; i < n - 1; i++) {
          unordered_set<int> s;
          for (int j = i + 1; j < n; j++) {
              int sum = -(arr[i] + arr[j]);
              if (s.find(sum) != s.end()) {
                  return true;
              }
              s.insert(arr[j]);
          }
      }
      return false;
      }
  };