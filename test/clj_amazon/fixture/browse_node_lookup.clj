(ns clj-amazon.fixture.browse-node-lookup)

(def response
  {:tag :BrowseNodeLookupResponse,
   :attrs {:xmlns "http://webservices.amazon.com/AWSECommerceService/2013-08-01"},
   :content
   [{:tag :OperationRequest,
     :attrs nil,
     :content
     [{:tag :HTTPHeaders,
       :attrs nil,
       :content
       [{:tag :Header, :attrs {:Value "Apache-HttpClient/4.5.1 (Java/1.8.0_40)", :Name "UserAgent"}, :content nil}]}
      {:tag :RequestId, :attrs nil, :content ["30ea7b98-eb5c-11e5-98f2-a728332b6d75"]}
      {:tag :Arguments,
       :attrs nil,
       :content
       [{:tag :Argument, :attrs {:Value "dummy-access-key", :Name "AWSAccessKeyId"}, :content nil}
        {:tag :Argument, :attrs {:Value "dummy-associate-tag", :Name "AssociateTag"}, :content nil}
        {:tag :Argument, :attrs {:Value "4175756051", :Name "BrowseNodeId"}, :content nil}
        {:tag :Argument, :attrs {:Value "BrowseNodeLookup", :Name "Operation"}, :content nil}
        {:tag :Argument, :attrs {:Value "AWSECommerceService", :Name "Service"}, :content nil}
        {:tag :Argument,
         :attrs {:Value "ao0YoUXm3rQg6hrly32yzr8pbM/35RwLeeGJY8SxsYE=", :Name "Signature"},
         :content nil}
        {:tag :Argument, :attrs {:Value "2016-03-16T09:47:00.000Z", :Name "Timestamp"}, :content nil}
        {:tag :Argument, :attrs {:Value "2013-08-01", :Name "Version"}, :content nil}]}
      {:tag :RequestProcessingTime, :attrs nil, :content ["0.006003066"]}]}
    {:tag :BrowseNodes,
     :attrs nil,
     :content
     [{:tag :Request,
       :attrs nil,
       :content
       [{:tag :IsValid, :attrs nil, :content ["True"]}
        {:tag :BrowseNodeLookupRequest,
         :attrs nil,
         :content [{:tag :BrowseNodeId, :attrs nil, :content ["4175756051"]}]}]}
      {:tag :BrowseNode,
       :attrs nil,
       :content
       [{:tag :BrowseNodeId, :attrs nil, :content ["4175756051"]}
        {:tag :Name, :attrs nil, :content ["【30%OFF】英語本セール"]}
        {:tag :Ancestors,
         :attrs nil,
         :content
         [{:tag :BrowseNode,
           :attrs nil,
           :content
           [{:tag :BrowseNodeId, :attrs nil, :content ["2275277051"]}
            {:tag :Name, :attrs nil, :content ["Special Features Stores"]}
            {:tag :Ancestors,
             :attrs nil,
             :content
             [{:tag :BrowseNode,
               :attrs nil,
               :content
               [{:tag :BrowseNodeId, :attrs nil, :content ["2275265051"]}
                {:tag :Name, :attrs nil, :content ["Self Service"]}
                {:tag :Ancestors,
                 :attrs nil,
                 :content
                 [{:tag :BrowseNode,
                   :attrs nil,
                   :content
                   [{:tag :BrowseNodeId, :attrs nil, :content ["2250738051"]}
                    {:tag :Name, :attrs nil, :content ["Kindleストア"]}]}]}]}]}]}]}]}]}]})
