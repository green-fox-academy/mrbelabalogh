page 50110 PetrolStation
{

    PageType = RoleCenter;
    Caption = 'PetrolStation Role Center';

    layout
    {
        area(RoleCenter)
        {
            group(Group1)
            {
                part(Part1; YourHeadLine)
                {
                    ApplicationArea = All;
                }
            }
        }
    }

    actions
    {
        area(Creation)
        {
            group(TakeAnOrder)
            {
                Caption = 'Take an order';

                action(CreateNewOrder)
                    {
                        ApplicationArea = All;
                        Caption = 'Creat a New Order';
                        


                    }
        }
    }
}
}
        area(Sections)
        {
            group(OilStats)
            {
                Caption = 'Oil Stats';

                action(OilOrderList)
                {
                    ApplicationArea = All;
                    Caption = 'To OilOrderList';
                    RunObject = Page OilOrderList;
                                    RunPageMode = View;
                }

                action(OilOrderCard)
                {
                    ApplicationArea = All;
                    Caption = 'ToOilOrderCard';
                    RunObject = query 50108;
                                    RunPageMode = View; //??

                }
            }
        }
    }
}
profile PetrolStationProfile
{
    Description = 'A new profile for the role center exercise';
    Caption = 'GFA Profile';
    ProfileDescription = 'new profile';
    RoleCenter = PetrolStation;
    Enabled = true;
    Promoted = true;

    Customizations = MyCustomization2;
}

pagecustomization MyCustomization2 customizes "Customer List"
{
    layout
    {
        modify(Name)
        {
            Visible = false;
        }
    }
}
