package id.kardihaekal.gempa_detector

import id.kardihaekal.gempa_detector.model.DataGempa

interface ItemClick {
    fun OnItemClickRecycler(gempa: DataGempa.Gempa)
}