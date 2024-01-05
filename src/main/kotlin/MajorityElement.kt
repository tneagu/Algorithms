/**
Majority Elements - Moore's Voting Algorithm

Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 */
class MajorityElement {

    fun majorityElement(nums: IntArray): Int {

        var votes = 1
        var candidate = nums[0]

        for (i in 1 until nums.size) {
            if (votes == 0) {
                candidate = nums[i]
                votes++
            } else if (nums[i] == candidate) {
                votes++
            } else {
                votes--
            }
        }

        return candidate
    }
}