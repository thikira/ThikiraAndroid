package com.dsm.restaurant

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_coupon.view.*

class CouponListAdapter : ListAdapter<CouponModel, CouponListAdapter.CouponHolder>(CouponModel.DIFF_CALLBACK) {

    inner class CouponHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind() {
            val item = getItem(adapterPosition)
            itemView.tv_coupon_status.text = item.status
            itemView.tv_coupon_date.text = item.expireDate
            itemView.tv_coupon_price.text = item.discountPrice
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CouponHolder =
        CouponHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_coupon, parent, false))

    override fun onBindViewHolder(holder: CouponHolder, position: Int) = holder.bind()
}