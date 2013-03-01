(ns webfui-lab.views.add-two-numbers
  (:require [webfui-lab.views.common :as common]
            [noir.content.getting-started])
  (:use [noir.core :only [defpage]]
        [hiccup.core :only [html]]))

(defpage "/add_two_numbers" []
  (common/layout "add_two_numbers"))
