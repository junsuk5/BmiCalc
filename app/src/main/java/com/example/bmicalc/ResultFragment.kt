/*
 *
 *  * Copyright 세민 Inc. All Rights Reserved.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *     http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.example.bmicalc


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_result.*


class ResultFragment : Fragment() {
    val args: ResultFragmentArgs by navArgs()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_result, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val calculator = BmiCalculator()
        val bmi = calculator.calculate(args.height, args.weight)

        when {
            bmi >= 35 -> result_text.text = "고도 비만"
            bmi >= 30 -> result_text.text = "2단계 비만"
            bmi >= 25 -> result_text.text = "1단계 비만"
            bmi >= 23 -> result_text.text = "과체중"
            bmi >= 18.5 -> result_text.text = "정상"
            else -> result_text.text = "저체중"
        }


    }


}
